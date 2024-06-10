<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
	<style>
		body{
			background-image: url("OIP.jpg");
			background-repeat: no-repeat;
			background-size: cover;
		}
</style>
</head>
<body>

    <div class="container bg-light opacity-75 col-lg-6 mt-5">
    <div class="row">
        <div class="col bg-body-secondary d-flex justify-content-center" >Write Article</div>
    </div>
    <div>
        <form action="articleupdate" class="p-2 " method="post" enctype="multipart/form-data">
            <div class="row">
                <div class="col-12 pt-2">
                    <label class=" form-control bg-light">Article Title</label>
                </div>
                <div class="col-12 pt-2">
                    <input type="text"class="form-control" name="title" id="" required>
                </div>
           </div>
           <div class="row">
            <div class="col-12 pt-2">
                <label class=" form-control bg-light">Upload Image</label>
            </div>
            <div class="col-12 pt-2">
                <input type="file" accept="Image/*"   class="form-control" name="image" id="">
            </div>
       </div>
       <div class="row">
        <div class="col-12 pt-2">
            <label class=" form-control bg-light">Write Content</label>
        </div>
        <div class="col-12 pt-2 ">
              <textarea  style="resize: none; height:200px ;" class="form-control" name="content" id="" rows="3"></textarea>

            </div>
        </div>
         <input type="submit" value="Upload" class="btn btn-secondary mt-2 ">
         </form>
   </div>
 
  </div>


    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script> 
</body>
</html>